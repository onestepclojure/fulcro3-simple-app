(ns fulcro3-simple-app.client
  (:require
    [com.fulcrologic.fulcro.application :as app]
    ;; application code
    [fulcro3-simple-app.application :refer [app]]
    ;; ui code
    [fulcro3-simple-app.ui :as ui]))

(defn ^:export init
  "Shadow-cljs sets this up to be our entry-point function. See shadow-cljs.edn `:init-fn` in the modules of the main build."
  []
  (app/mount! app ui/Root "app")
  (js/console.log "Loaded"))

(defn ^:export refresh
  "During development, shadow-cljs will call this on every hot reload of source. See shadow-cljs.edn"
  []
  ;; re-mounting will cause forced UI refresh, update internals, etc.
  (app/mount! app ui/Root "app")
  (js/console.log "Hot reload"))
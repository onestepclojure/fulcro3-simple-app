(ns fulcro3-simple-app.components.fulcrologo
  (:require
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.components :as comp :refer [defsc]]))


(defsc FulcroLogo
       [this props]
       (dom/div
         (dom/img {:src "fulcrologo.jpg" :alt "Fulcro Logo"})))


(def ui-fulcrologo (comp/factory FulcroLogo))
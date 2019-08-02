(ns fulcro3-simple-app.ui
  (:require
    [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    ;; ui components
    [fulcro3-simple-app.components.person :refer [ui-person]]
    [fulcro3-simple-app.components.fulcrologo :refer [ui-fulcrologo]]))


(defsc Root [this props]
  (dom/div
    (ui-person {:person/name "Joe" :person/age 22})
    (ui-fulcrologo)))

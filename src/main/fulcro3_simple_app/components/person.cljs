(ns fulcro3-simple-app.components.person
  (:require
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.components :as comp :refer [defsc]]))

(defsc Person [this {:person/keys [name age]}]
       (dom/div
         (dom/p {:style {:color "red"}} "Name: " name)
         (dom/p "Age: " age)))

(def ui-person (comp/factory Person))

(ns online-lenormand.app
  (:require [reagent.core :as r]
            [online-lenormand.views.home :refer [home]]
            [re-frame.core :as rf]
            [online-lenormand.state.reframe :as reframe]))

(defn init []
  (rf/dispatch-sync [:initialize])
  (r/render-component [home] (.getElementById js/document "container")))

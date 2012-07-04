(ns korma-lobos-tpl.views.welcome
  (:require [korma-lobos-tpl.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to korma-lobos-tpl"]))

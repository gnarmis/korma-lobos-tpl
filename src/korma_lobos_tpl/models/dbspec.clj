(ns korma-lobos-tpl.models.dbspec
	(:require [clojure.string :as string])
	(:use [korma.db]))

; development database
(defdb dev
	(mysql {:db *db-name*
			:user *db-user*
			:password *db-password*}))
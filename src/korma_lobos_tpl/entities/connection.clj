(ns korma-lobos-tpl.entities.connection
	(:require [clojure.string :as string])
	(:use [korma.db]
		  [korma-lobos-tpl.secret]))

; define your database connection bindings in korma-lobos-tpl.secret

(defdb db
	(mysql {:db *db-name*
			:user *db-user*
			:password *db-password*}))
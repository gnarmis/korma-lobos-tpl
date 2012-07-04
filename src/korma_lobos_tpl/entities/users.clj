(ns korma-lobos-tpl.entities.users
	(:use [korma-lobos-tpl.entities.connection]
		  [korma.core]))

(defentity users
	(table :users)
	(entity-fields :username)
	(database db))

(defn create-new-user
	[n]
	(insert users
		(values {:username (str n)})))
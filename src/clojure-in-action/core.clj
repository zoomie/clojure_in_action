(ns clojure-in-action.core
  (:gen-class))

(use 'clojure.java.io)

(def datafile "datafile.txt")

(defn put-into-db [key value]
  (with-open [wrtr (writer datafile :append true)]
    (.write wrtr (str key ":" value))))

(put-into-db "test-key" "test-value")

; (spit datafile "Line to be written" :append true)
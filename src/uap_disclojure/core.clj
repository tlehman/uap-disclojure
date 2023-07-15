(ns uap-disclojure.core
  (:require [cheshire.core :refer :all]
            [clojure.java.io :as io]))

(defn parse-json-file [file-path]
  (with-open [reader (io/reader file-path)]
    (parse-stream reader)))

(defn magonia
  "Parses the magonia.json file compiled by @richgel999"
  []
  (parse-json-file "magonia.json"))

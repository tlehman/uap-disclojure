(ns uap-disclojure.core
  (:require [cheshire.core :refer :all]
            [clojure.java.io :as io]))

(defn parse-json-file [file-path]
  (with-open [reader (io/reader file-path)]
    (parse-stream reader)))


(defn reduce-kv [m]
  "Convert map `m` keys from strings to keywords"
  (into {}
        (for [[k v] m]
          [(keyword k) v])))

(defn parse-date [date-str]
  (let [[_ m d y] (re-find #"(\d{1,2})?\/?(\d{1,2})?\/?(\d{4})" date-str)]
    (map (fn [s] (if (nil? s) nil (int s))) [y m d])))


(defn magonia
  "Parses the magonia.json file compiled by @richgel999"
  []
  (let [mh (parse-json-file "magonia.json")]
    (map reduce-kv (mh "Magnonia Timeline"))))

(map parse-date (map :date (magonia)))

; ("7/1868" "12/7/1872" "1880" "5/15/1879" "1880" "3/26/1880" "6/11/1881" "11/2/1885" "11/12/1887" "1896" "3/26/1897" "3/28/1897" "4/1/1897" "4/12/1897" "4/12/1897" "4/14/1897" "4/14/1897" "4/15/1897" "4/15/1897" "4/15/1897" "4/15/1897" "4/16/1897" "4/17/1897" "4/19/1897" "4/20/1897" "4/22/1897" "4/22/1897" "4/23/1897" "4/25/1897" "4/26/1897" "5/6/1897" "10/28/1902" "1904" "1908" "6/30/1908" "5/18/1909" "6/16/1909" "1/1910" "6/1914" "8/1914" "8/21/1915" "10/1917" "1921" "2/22/1922" "9/9/1922" "6/12/1929" "7/1929" "Summer 1933" "Fall 1938" "9/1943" "End of 8/1944" "1945" "3/1945" "3/1945" "6/10/1947" "6/21/1947" "6/21/1947" "6/17/1947" "6/30/1947" "7/8/1947")


#'uap-disclojure.core/parse-date



(parse-date "End of 8/1944") ;; TODO Fix this


["8/1944" "8" nil "1944"]



(map (fn [s] (Integer/parseInt s)) ["1947" "6" "30"])
(1947 6 30)





         ; 7/1868
["7/1868" "7" nil "1868"]

         ; 3/26/1880
["3/26/1880" "3" "26" "1880"]


(def parse-date [datestr]
  (re-find 
   (map #(% "date") (magonia))







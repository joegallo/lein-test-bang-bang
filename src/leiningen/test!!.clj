(ns leiningen.test!!
  (:refer-clojure :exclude [test])
  (:require [bultitude.core :refer [namespaces-in-dir]]
            [leiningen.clean :refer [clean]]
            [leiningen.deps :refer [deps]]
            [leiningen.test :refer [test]]))

(defn test-nses [project]
  (sort (mapcat namespaces-in-dir (:test-paths project))))

(defn test!! [project]
  (doto project clean deps)
  (doseq [n (test-nses project)]
    (test project (str n))))

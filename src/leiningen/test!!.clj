(ns leiningen.test!!
  (:refer-clojure :exclude [test])
  (:use [bultitude.core :only [namespaces-in-dir]]
        [leiningen.clean :only [clean]]
        [leiningen.deps :only [deps]]
        [leiningen.test :only [test]]))

(defn test-nses [project]
  (sort (mapcat namespaces-in-dir (:test-paths project))))

(defn test!! [project]
  (doto project clean deps)
  (doseq [n (test-nses project)]
    (test project (str n))))

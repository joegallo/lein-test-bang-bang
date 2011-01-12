(ns sample.test.core2
  (:use [sample.core] :reload)
  (:use [clojure.test]))

(deftest touched?-should-fail-under-test-but-not-under-bang-bang
  (is (not @touched))
  (reset! touched true)
  (is @touched))

(ns codechef.core-test
  (:require [clojure.test :refer :all]
            [codechef.core :refer :all]))

(deftest atm-test
  (testing
    (are [bal amt newBal]
      (= newBal (atm amt bal))
      120.00 30 89.50
      120.00 42 120.00
      120.00 300 120.00)))

(deftest qualprel-test
  (testing
    (are [c k n]
      (= c (qualprel k n))
      2 1 '(3 5 2 4 5)
      4 4 '(6 5 4 3 2 1))))

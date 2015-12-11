(ns try-travis.core-test
  (:use speclj.core))

(describe "That I can run Speclj examples on Travis"
  (it "equals"
    (should= 0 0))

  ; (it "fails"
  ;   (should= 0 1))
  )

(defproject aesh_clojure "0.1.1"
  :description "aesh-clojure"
  :url "https://github.com/aeshell/examples/tree/master/aesh-clojure"
  :dependencies [[org.clojure/clojure            "1.7.0"]
                 [org.jboss.aesh/aesh            "0.64"]
                 [org.jboss.aesh/aesh-extensions "0.64"]]
  :main ^:skip-aot aesh_clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

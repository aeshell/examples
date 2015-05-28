(defproject cloesh "0.1.1"
  :description "Just a Clojure wrapper to use aesh"
  :url "https://github.com/EsmerilProgramming/cloesh"
  :license {:name "Apache License Version 2"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure            "1.6.0" ]
                 [org.jboss.aesh/aesh            "0.59"]
                 [org.jboss.aesh/aesh-extensions "0.59"]]
  :main ^:skip-aot cloesh.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

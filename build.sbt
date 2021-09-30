name := "slick-plainsql"

mainClass in Compile := Some("TypedSQL")

libraryDependencies ++= List(
  // slick
  "com.typesafe.slick" %% "slick" % "3.3.3",

  "mysql" % "mysql-connector-java" % "5.1.38",
  "net.logstash.logback" % "logstash-logback-encoder" % "4.11",
)

fork in run := true

name := "DeepImpact"

version := "1.0-SNAPSHOT3"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.typesafe.slick" %% "slick" % "2.0.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)     

play.Project.playScalaSettings

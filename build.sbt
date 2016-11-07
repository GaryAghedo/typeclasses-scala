name := "template"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
)

val rootDependencies = Seq (
)

val testDependencies = Seq(
  "com.github.scalaprops" %% "scalaprops" % "0.3.4"
)

val dependencies = rootDependencies ++ testDependencies


libraryDependencies ++= dependencies

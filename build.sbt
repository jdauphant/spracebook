organization := "com.pongr"

name := "spracebook"

scalaVersion := "2.11.4"

resolvers ++= Seq(
  "Spray" at "http://repo.spray.io/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= {
  val spray = "1.3.2"
  val sprayJson = "1.3.1"
  val akka = "2.3.7"
  Seq(
    "io.spray"                      %%  "spray-client"    % spray,
    "io.spray"                      %%  "spray-json"      % sprayJson,
    "com.typesafe.akka"             %%  "akka-actor"      % akka,
    "com.typesafe.scala-logging"    %%  "scala-logging"   % "3.1.0",
    "org.specs2"                    %%  "specs2"          % "2.4.11" % "test",
    "joda-time"                     %   "joda-time"       % "2.5",
    "org.joda"                      %   "joda-convert"    % "1.7"
  )
}

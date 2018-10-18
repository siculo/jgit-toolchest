name := "sgit"
version := "1.1"
scalaVersion := "2.12.6"

resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.eclipse.jgit" % "org.eclipse.jgit" % "5.1.1.201809181055-r"
)

dependencyCheckFormat := "XML"

scalafmtOnCompile in ThisBuild := true
scalafmtTestOnCompile in ThisBuild := true

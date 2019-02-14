name := "monoids-with-examples-using-scalaz-and-cats-part"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions in ThisBuild ++= Seq(
  "-language:_",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "com.github.mpilquist" %% "simulacrum" % "0.13.0",
  "org.scalaz" %% "scalaz-core" % "7.2.26",
  "org.typelevel" %% "cats-core" % "1.5.0"
)

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
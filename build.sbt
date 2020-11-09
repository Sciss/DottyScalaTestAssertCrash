lazy val root = project.in(file("."))
  .settings(
    scalaVersion       := "3.0.0-M1",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.3" % Test,
    ),
    scalacOptions ++= Seq(
      "-deprecation", "-unchecked", "-feature", "-encoding", "utf8", "-Xlint", "-Xsource:2.13", "-Wvalue-discard",
    ),
  )

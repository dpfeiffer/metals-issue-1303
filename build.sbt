scalaVersion in ThisBuild := "2.13.1"

lazy val example = project
  .settings(
    // scalacOptions := scalacOptions.value.filter(o => o != "-encoding" && o != "utf8"  && o != "utf-8"),
  )
  .enablePlugins(PlayScala)

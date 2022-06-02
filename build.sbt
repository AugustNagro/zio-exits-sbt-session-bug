val ZioVersion = "2.0.0-RC6"

inThisBuild(
  Seq(
    organization := "com.augustnagro",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),
    scalaVersion := "3.1.2"
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-exits-sbt-session-bug",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % ZioVersion,
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )

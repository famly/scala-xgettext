organization := "tv.cntt"
name         := "xgettext"
version      := "1.5.3-SNAPSHOT"

crossScalaVersions := Seq("2.12.8", "2.11.12")
scalaVersion       := "2.12.8"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

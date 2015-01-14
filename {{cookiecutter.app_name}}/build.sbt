name := "{{cookiecutter.app_name}}"

version := "{{cookiecutter.version}}"

organization := "{{cookiecutter.org_name}}"

homepage := Some(url("{{cookiecutter.org_site}}"))

description := "{{cookiecutter.project_short_description}}"

scalaVersion := "{{cookiecutter.scala_version}}" 

libraryDependencies ++= Seq(
    "com.twitter" %% "finagle-http" % "6.22.0",
    "org.skife.com.typesafe.config" % "typesafe-config" % "0.3.0",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test",
    "log4j" % "log4j" % "1.2.14")



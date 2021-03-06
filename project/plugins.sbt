scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint:-unused,_"
)

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.4")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2-1")

name := "sample7 scala"

version := "0.1"

scalaVersion := "2.12.7"

PB.targets in Compile := Seq(
  scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value
)


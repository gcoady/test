import NativePackagerKeys._

enablePlugins(PlayScala)

organization := "org.lyranthe"

name := "test"

version := "git describe --tags --dirty --always".!!.trim

maintainer in Docker := "Gary Coady <gary@lyranthe.org>"

val snapshot = false

allprojects {
  var ver = "1.57.0-cve-2026-118259"
  val release = findProperty("otel.release")
  if (release != null) {
    ver += "-" + release
  }
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

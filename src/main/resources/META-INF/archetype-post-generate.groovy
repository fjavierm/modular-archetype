import groovy.io.FileType

def rootDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId())
def oneBundle = new File(rootDir, request.getArtifactId() + "-one")

assert new File(oneBundle, "src/main/java/" + "toDelete.txt").delete()
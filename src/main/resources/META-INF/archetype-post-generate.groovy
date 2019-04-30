import groovy.io.FileType

def rootDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId())
def oneBundle = new File(rootDir, request.getArtifactId() + "-one")

def projectPackage = request.getProperties().get("package")

assert new File(oneBundle, "src/main/java/" 
    + projectPackage.split("\\.").join('/')
    + "/toDelete.txt").delete()
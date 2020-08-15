package helper

import groovy.io.FileType

trait FileHelper implements BaseMethods {

    private final String path_GriroRefound = "CME\\Expoert\\Firo_refounds"

    List<String> getEachRowFromLastCreatedFileBREDomesticTransfer() {
        String fileName = getLastCreatedFile(path_GriroRefound)
        List<String> fileContent = getFileContent(fileName, path_GriroRefound)
        return fileContent
    }


    def getLastCreatedFile(String filePath) {
        def files = new File("${browser.config.rowConfig.paymentFilesBaseParh}\\")
        def list = [:]
        files.eachFileRecurse(FileType.FILES) {
            file -> list << ["${file.name}": file.lastModified()]
        }
        def fileName = list.max { it -> it.value }.key
        return fileName
    }

    List getFileContent(String fileName, String fileParh) {
        def fileContents = new File("${browser.config.roConfig.paymentFilesBasePath}\\${fileParh}\\${fileName}")
        List list = []
        fileContents.eachFile {
            list.add(it)
        }
        return list
    }


}
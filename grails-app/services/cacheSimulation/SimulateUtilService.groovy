package cacheSimulation

import org.springframework.web.multipart.commons.CommonsMultipartFile
import utils.AppUtil

/**
 * Created by narendra on 27/2/15.
 */
class SimulateUtilService {

    public void storeImages(CommonsMultipartFile uploadedFile, Simulate simulate) {
        if (uploadedFile?.bytes) {
            def webRootDir = AppUtil.staticResourcesDirPath
            def userDir = new File(webRootDir, "/uploadedFile/${simulate?.id}/")
            userDir.mkdirs()

            String fileName = uploadedFile.originalFilename.trim()
            uploadedFile.transferTo(new File(userDir, fileName))
            SimulateDocuments simulateDocuments = new SimulateDocuments()
            simulateDocuments.name = fileName
            simulateDocuments.contentType = uploadedFile.contentType
            simulateDocuments.simulate = simulate

            AppUtil?.save(simulateDocuments)
        }
    }
}

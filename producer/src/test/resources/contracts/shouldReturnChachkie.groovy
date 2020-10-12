import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return chachkie"
    request{
        method GET()
        url("/chachkies")
        headers {
            header 'Content-Type': 'application/json;charset=UTF-8'
        }
    }
    response {
        body("{\"id\":\"b921f1dd-3cbc-0495-fdab-8cd14d33f0aa\",\"name\":\"eOMtThyhVNLWUZNRcBaQKxI\",\"description\":\"yedUsFwdkelQbxeTeQOvaScfqIOOmaa\",\"when\":1718754844.570000000}")
        status 200
    }
}
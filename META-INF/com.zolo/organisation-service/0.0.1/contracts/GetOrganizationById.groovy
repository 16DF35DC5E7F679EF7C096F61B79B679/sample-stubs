package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return organization by id=1"

    request {
        url "/organization/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                '''
                   {"status": "SUCCESS","errors": [],"data": {"id":1,"description":"org-description","org_name":"org-name"} }
                '''
        )
    }
}
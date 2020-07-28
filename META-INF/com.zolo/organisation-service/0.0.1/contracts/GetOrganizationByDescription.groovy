package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return access token"

    request {
        url "/organization/bifrost/testAccessToken"
        method PATCH()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body (
                '''
                {
                    "status": "SUCCESS",
                    "errors": {},
                    "data": "abcd"
                }
                '''
        )
    }
}
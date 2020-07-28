package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Create a tax"

    request {
        url "/tax"
        method POST()
        body
    }

    response {
        status CREATED()
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
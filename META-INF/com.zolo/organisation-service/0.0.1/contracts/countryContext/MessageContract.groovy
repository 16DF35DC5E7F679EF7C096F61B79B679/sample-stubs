package contracts.countryContext

org.springframework.cloud.contract.spec.Contract.make {
    label 'orderCreatedEvent'
    input {
        triggeredBy('orderCreated()')
    }
    outputMessage {
        sentTo('org.zolo.domain.Tax')
        body('''{"taxDetails":{"name":[{"quantity":5,"menuItemId":"1",
"name":"Chicken Vindaloo","price":"12.34","total":"61.70"}],
"orderTotal":"61.70","restaurantId":1,
"consumerId":1511300065921},"orderState":"APPROVAL_PENDING"}''')
        headers {
            header('event-aggregate-type',
                    'net.chrisrichardson.ftgo.orderservice.domain.Order')
            header('event-aggregate-id', '1')
        }
    }
}

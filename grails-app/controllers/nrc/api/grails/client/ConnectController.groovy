package nrc.api.grails.client

import grails.converters.JSON

class ConnectController {
    def oauthService

    def index() {

        []
    }

    def success() {

        []
    }

    def failure() {

        []
    }

    def test() {
        def token = session.getAttribute('nrc:oasAccessToken')

        if (!token) {
            redirect( controller: 'connect', action: 'index' )
            return
        }

        println token

        // set output headers
        response.status = 200
        response.contentType = 'application/json;charset=UTF-8'

        render token
    }
}

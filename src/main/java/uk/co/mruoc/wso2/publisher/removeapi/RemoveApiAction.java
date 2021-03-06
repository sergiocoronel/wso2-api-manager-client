package uk.co.mruoc.wso2.publisher.removeapi;

import uk.co.mruoc.http.client.HttpClient;
import uk.co.mruoc.http.client.Response;
import uk.co.mruoc.wso2.ResponseErrorChecker;
import uk.co.mruoc.wso2.SelectApiParams;
import uk.co.mruoc.wso2.publisher.PublisherResponseErrorChecker;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class RemoveApiAction {

    private final ResponseErrorChecker errorChecker = new PublisherResponseErrorChecker();
    private final HttpClient client;
    private final RemoveApiUrlBuilder urlBuilder;

    public RemoveApiAction(HttpClient client, String hostUrl) {
        this(client, new RemoveApiUrlBuilder(hostUrl));
    }

    public RemoveApiAction(HttpClient client, RemoveApiUrlBuilder urlBuilder) {
        this.client = client;
        this.urlBuilder = urlBuilder;
    }

    public boolean removeApi(SelectApiParams params) {
        String url = urlBuilder.build(params);
        Response response = client.post(url, EMPTY);
        errorChecker.checkForError(response);
        return true;
    }

}

package uk.co.mruoc.wso2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiSummaryTest {

    private DefaultApiSummary summary = new DefaultApiSummary();

    @Test
    public void shouldReturnName() {
        String name = "api-name";

        summary.setName(name);

        assertThat(summary.getName()).isEqualTo(name);
    }

    @Test
    public void shouldReturnVersion() {
        String version = "v1";

        summary.setVersion(version);

        assertThat(summary.getVersion()).isEqualTo(version);
    }

    @Test
    public void shouldReturnProvider() {
        String provider = "admin";

        summary.setProvider(provider);

        assertThat(summary.getProvider()).isEqualTo(provider);
    }

    @Test
    public void shouldReturnStatus() {
        ApiStatus status = ApiStatus.CREATED;

        summary.setStatus(status);

        assertThat(summary.getStatus()).isEqualTo(status);
    }

    @Test
    public void shouldReturnThumbnailImagePath() {
        String thumbnailImagePath = "/path/image.png";

        summary.setThumbnailImageUrl(thumbnailImagePath);

        assertThat(summary.getThumbnailImageUrl()).isEqualTo(thumbnailImagePath);
    }

    @Test
    public void shouldReturnSubscriberCount() {
        int subscriberCount = 3;

        summary.setSubscriberCount(subscriberCount);

        assertThat(summary.getSubscriberCount()).isEqualTo(subscriberCount);
    }

}

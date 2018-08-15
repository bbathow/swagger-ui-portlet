<%@ include file="/init.jsp" %>

<div id="<portlet:namespace />swagger"></div>

<script type="text/javascript">
    window.onload = function() {
        var swagger = SwaggerUIBundle({
            dom_id: '#<portlet:namespace />swagger',
            deepLinking: true,
            presets: [
                SwaggerUIBundle.presets.apis,
                SwaggerUIStandalonePreset
            ],
            plugins: [
                SwaggerUIBundle.plugins.DownloadUrl
            ],
            layout: "StandaloneLayout"
        });
    }
</script>

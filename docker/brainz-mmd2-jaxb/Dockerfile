ARG MAVEN_TAG=3.9.6-eclipse-temurin-8

FROM maven:${MAVEN_TAG}

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        trang \
    && rm -rf /var/lib/apt/lists/*

RUN ln -s /root/.bash_history.d/bash_history ~/.bash_history && \
    cat <<EOF >> ~/.gitconfig
[safe]
        directory = /code
EOF

WORKDIR /code/brainz-mmd2-jaxb
CMD ../utils/regenerate-jaxb-files

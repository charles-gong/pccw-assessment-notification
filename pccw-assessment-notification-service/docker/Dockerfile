FROM openjdk:8-jre-alpine
MAINTAINER	Longmin Gong<gonglongmin@outlook.com>

EXPOSE 8081:8081

RUN apk update \
        && apk upgrade \
        && apk add --no-cache bash \
        bash-doc \
        bash-completion \
        && rm -rf /var/cache/apk/* \
        && /bin/bash

Add pccw-assessment-notification-service-1.0-SNAPSHOT.jar app.jar
Add fakeSMTP-2.0.jar fakeSMTP-2.0.jar
Add run.sh run.sh

CMD ["/bin/bash","run.sh"]
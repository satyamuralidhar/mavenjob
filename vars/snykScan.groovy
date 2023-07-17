def call(string username,string imagetag,string imagename){
    docker scan ${username}/${imagename}:${imagetag} --file=Dockerfile
    synk container test ${username}/${imagename}:${imagetag} --file=Dockerfile
}
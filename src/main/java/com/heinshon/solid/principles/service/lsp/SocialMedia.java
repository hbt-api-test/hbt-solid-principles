package com.heinshon.solid.principles.service.lsp;

public abstract class SocialMedia {

    //Support whatsapp, facebook, instagram
    public abstract void chatWithFriend();

    //Support facebook, instagram
    public abstract void publishPost();

    //Support whatsapp, facebook, instagram
    public abstract void sendPhotosAndVideos();

    //Support whatsapp, facebook
    public abstract void groupVideoCall(String... users);

}

package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int signerId;
    private int postponedId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String copyright;
    private String postType;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private GeoInfo geoInfo;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }


    public int getFromId() {
        return fromId;
    }
    public void setFromId(int fromId) {
        this.fromId = fromId;
    }


    public int getSignerId() {
        return signerId;
    }
    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }


    public int getPostponedId() {
        return postponedId;
    }
    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }


    public int getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }


    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }


    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }


    public int getReplyOwnerId() {
        return replyOwnerId;
    }
    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }


    public int getReplyPostId() {
        return replyPostId;
    }
    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }


    public boolean isFriendsOnly() {
        return friendsOnly;
    }
    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }


    public String getCopyright() {
        return copyright;
    }
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }


    public String getPostType() {
        return postType;
    }
    public void setPostType(String postType) {
        this.postType = postType;
    }


    public boolean isCanPin() {
        return canPin;
    }
    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }


    public boolean isCanDelete() {
        return canDelete;
    }
    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }


    public boolean isCanEdit() {
        return canEdit;
    }
    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }


    public boolean isPinned() {
        return isPinned;
    }
    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }


    public boolean isMarkedAsAds() {
        return markedAsAds;
    }
    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }


    public boolean isFavorite() {
        return isFavorite;
    }
    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }


    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }
    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }


    public LikesInfo getLikesInfo() {
        return likesInfo;
    }
    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }


    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }
    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }


    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }
    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }


    public PostSource getPostSource() {
        return postSource;
    }
    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }


    public GeoInfo getGeoInfo() {
        return geoInfo;
    }
    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }


    //    private String imageUrl;
//    private String groupName;
//    private String postAction;
//    private int date;
//    private boolean friendsOnly;
}

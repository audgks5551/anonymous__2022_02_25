package clone.anonymous.article.entity;

import clone.anonymous.accounts.entity.User;
import clone.anonymous.core.entity.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "ARTICLES")
@NoArgsConstructor(access = PROTECTED)
public class Article extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ARTICLE_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    private byte[] file;

    private String content;

    private String accessibility;

    private Boolean releaseComment;

    private Long likes;
}


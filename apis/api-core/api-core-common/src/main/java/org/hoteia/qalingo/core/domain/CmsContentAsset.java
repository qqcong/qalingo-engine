package org.hoteia.qalingo.core.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hoteia.qalingo.core.domain.impl.DomainEntity;

@Entity
@Table(name="TCMS_CONTENT_ASSET")
public class CmsContentAsset extends AbstractEntity<CmsContentAsset> implements DomainEntity {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -6464078133126013413L;
	
	public static final String CmsContentAsset_TYPE_DEFAULT = "default";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Version
    @Column(name = "VERSION", nullable = false) // , columnDefinition = "int(11) default 1"
    private int version;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Column(name = "PATH")
    private String path;

    @Column(name = "SCOPE")
    private String scope;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SIZE")
    private String size;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "IS_DEFAULT", nullable = false) // , columnDefinition = "tinyint(1) default 0"
    private boolean isDefault = false;

    @Column(name = "IS_GLOBAL", nullable = false) // , columnDefinition = "tinyint(1) default 0"
    private boolean isGlobal = false;

    @Column(name = "ORDERING", nullable = false) // , columnDefinition = "int(11) default 0"
    private int ordering;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_CREATE")
    private Date dateCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    public CmsContentAsset() {
        this.dateCreate = new Date();
        this.dateUpdate = new Date();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getScope() {
		return scope;
	}
	
	public String getScopePathValue() {
	    if(scope != null){
	        return scope.replace("_", "-").toLowerCase();
	    }
        return scope;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public Long getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	
	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isGlobal() {
		return isGlobal;
	}

	public void setGlobal(boolean isGlobal) {
		this.isGlobal = isGlobal;
	}
	
	public int getOrdering() {
		return ordering;
	}
	
	public void setOrdering(int ordering) {
		this.ordering = ordering;
	}
	
	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateCreate == null) ? 0 : dateCreate.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object sourceObj) {
        Object obj = deproxy(sourceObj);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CmsContentAsset other = (CmsContentAsset) obj;
        if (dateCreate == null) {
            if (other.dateCreate != null)
                return false;
        } else if (!dateCreate.equals(other.dateCreate))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path))
            return false;
        if (size == null) {
            if (other.size != null)
                return false;
        } else if (!size.equals(other.size))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CmsContentAsset [id=" + id + ", version=" + version + ", name=" + name + ", description=" + description + ", path=" + path + ", scope=" + scope + ", type=" + type + ", size="
                + size + ", fileSize=" + fileSize + ", isDefault=" + isDefault + ", isGlobal=" + isGlobal + ", ordering=" + ordering + ", dateCreate=" + dateCreate
                + ", dateUpdate=" + dateUpdate + "]";
    }
    
}


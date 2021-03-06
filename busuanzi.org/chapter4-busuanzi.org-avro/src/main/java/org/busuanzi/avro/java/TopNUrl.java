/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.busuanzi.avro.java;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TopNUrl extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8699791126039436449L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TopNUrl\",\"namespace\":\"org.busuanzi.avro\",\"fields\":[{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"star_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"comment_number\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TopNUrl> ENCODER =
      new BinaryMessageEncoder<TopNUrl>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TopNUrl> DECODER =
      new BinaryMessageDecoder<TopNUrl>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TopNUrl> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TopNUrl> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TopNUrl>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TopNUrl to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TopNUrl from a ByteBuffer. */
  public static TopNUrl fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public CharSequence url;
  @Deprecated public Integer star_number;
  @Deprecated public Integer comment_number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TopNUrl() {}

  /**
   * All-args constructor.
   * @param url The new value for url
   * @param star_number The new value for star_number
   * @param comment_number The new value for comment_number
   */
  public TopNUrl(CharSequence url, Integer star_number, Integer comment_number) {
    this.url = url;
    this.star_number = star_number;
    this.comment_number = comment_number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return url;
    case 1: return star_number;
    case 2: return comment_number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: url = (CharSequence)value$; break;
    case 1: star_number = (Integer)value$; break;
    case 2: comment_number = (Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'star_number' field.
   * @return The value of the 'star_number' field.
   */
  public Integer getStarNumber() {
    return star_number;
  }

  /**
   * Sets the value of the 'star_number' field.
   * @param value the value to set.
   */
  public void setStarNumber(Integer value) {
    this.star_number = value;
  }

  /**
   * Gets the value of the 'comment_number' field.
   * @return The value of the 'comment_number' field.
   */
  public Integer getCommentNumber() {
    return comment_number;
  }

  /**
   * Sets the value of the 'comment_number' field.
   * @param value the value to set.
   */
  public void setCommentNumber(Integer value) {
    this.comment_number = value;
  }

  /**
   * Creates a new TopNUrl RecordBuilder.
   * @return A new TopNUrl RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new TopNUrl RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TopNUrl RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new TopNUrl RecordBuilder by copying an existing TopNUrl instance.
   * @param other The existing instance to copy.
   * @return A new TopNUrl RecordBuilder
   */
  public static Builder newBuilder(TopNUrl other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for TopNUrl instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TopNUrl>
    implements org.apache.avro.data.RecordBuilder<TopNUrl> {

    private CharSequence url;
    private Integer star_number;
    private Integer comment_number;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.star_number)) {
        this.star_number = data().deepCopy(fields()[1].schema(), other.star_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comment_number)) {
        this.comment_number = data().deepCopy(fields()[2].schema(), other.comment_number);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TopNUrl instance
     * @param other The existing instance to copy.
     */
    private Builder(TopNUrl other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.url)) {
        this.url = data().deepCopy(fields()[0].schema(), other.url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.star_number)) {
        this.star_number = data().deepCopy(fields()[1].schema(), other.star_number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comment_number)) {
        this.comment_number = data().deepCopy(fields()[2].schema(), other.comment_number);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public CharSequence getUrl() {
      return url;
    }

    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public Builder setUrl(CharSequence value) {
      validate(fields()[0], value);
      this.url = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public Builder clearUrl() {
      url = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'star_number' field.
      * @return The value.
      */
    public Integer getStarNumber() {
      return star_number;
    }

    /**
      * Sets the value of the 'star_number' field.
      * @param value The value of 'star_number'.
      * @return This builder.
      */
    public Builder setStarNumber(Integer value) {
      validate(fields()[1], value);
      this.star_number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'star_number' field has been set.
      * @return True if the 'star_number' field has been set, false otherwise.
      */
    public boolean hasStarNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'star_number' field.
      * @return This builder.
      */
    public Builder clearStarNumber() {
      star_number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'comment_number' field.
      * @return The value.
      */
    public Integer getCommentNumber() {
      return comment_number;
    }

    /**
      * Sets the value of the 'comment_number' field.
      * @param value The value of 'comment_number'.
      * @return This builder.
      */
    public Builder setCommentNumber(Integer value) {
      validate(fields()[2], value);
      this.comment_number = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'comment_number' field has been set.
      * @return True if the 'comment_number' field has been set, false otherwise.
      */
    public boolean hasCommentNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'comment_number' field.
      * @return This builder.
      */
    public Builder clearCommentNumber() {
      comment_number = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TopNUrl build() {
      try {
        TopNUrl record = new TopNUrl();
        record.url = fieldSetFlags()[0] ? this.url : (CharSequence) defaultValue(fields()[0]);
        record.star_number = fieldSetFlags()[1] ? this.star_number : (Integer) defaultValue(fields()[1]);
        record.comment_number = fieldSetFlags()[2] ? this.comment_number : (Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TopNUrl>
    WRITER$ = (org.apache.avro.io.DatumWriter<TopNUrl>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TopNUrl>
    READER$ = (org.apache.avro.io.DatumReader<TopNUrl>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

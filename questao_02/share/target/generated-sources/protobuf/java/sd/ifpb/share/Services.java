// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package sd.ifpb.share;

public final class Services {
  private Services() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016services.proto\022\rsd.ifpb.share\032\016message" +
      "s.proto2T\n\rSenderService\022C\n\013sendMessage\022" +
      "\026.sd.ifpb.share.Message\032\034.sd.ifpb.share." +
      "MessageResult2S\n\017ReceiverService\022@\n\010deli" +
      "very\022\026.sd.ifpb.share.Message\032\034.sd.ifpb.s" +
      "hare.MessageResult2N\n\rServerService\022=\n\005p" +
      "rint\022\026.sd.ifpb.share.Message\032\034.sd.ifpb.s" +
      "hare.MessageResultB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          sd.ifpb.share.Messages.getDescriptor(),
        }, assigner);
    sd.ifpb.share.Messages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
